package com.yupi.springbootinit.manager;

import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xulongfei
 * @date 2023/8/17 14:00
 */
@Service
public class AiManager {

    @Resource
    private YuCongMingClient yuCongMingClient;

    /**
     *  AI对话
     * @param msg
     * @return
     */
    public String doChat(long modeId, String msg) {
        DevChatRequest devChatRequest = new DevChatRequest();
//        devChatRequest.setModelId(1692059411318616065L);
        devChatRequest.setModelId(modeId);
        devChatRequest.setMessage(msg);
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        if (response == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI 相应错误");
        }
        return response.getData().getContent();
    }
}
