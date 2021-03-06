package org.zstack.header.vm;

import org.springframework.http.HttpMethod;
import org.zstack.header.identity.Action;
import org.zstack.header.message.APIMessage;
import org.zstack.header.message.APIParam;
import org.zstack.header.rest.RestRequest;

@Action(category = VmInstanceConstant.ACTION_CATEGORY)
@RestRequest(
        path = "/vm-instances/{uuid}/actions",
        method = HttpMethod.PUT,
        isAction = true,
        responseClass = APIUpdateVmPriorityEvent.class
)
public class APIUpdateVmPriorityMsg extends APIMessage implements VmInstanceMessage {
    @APIParam(resourceType = VmInstanceVO.class, checkAccount = true, operationTarget = true)
    private String uuid;
    @APIParam
    private String priority;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String getVmInstanceUuid() {
        return getUuid();
    }

    public static APIUpdateVmPriorityMsg __example__() {
        APIUpdateVmPriorityMsg msg = new APIUpdateVmPriorityMsg();
        msg.uuid = uuid();
        msg.priority = "High";
        return msg;
    }
}
