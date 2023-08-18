package com.yupi.springbootinit.api;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.yupi.springbootinit.manager.AiManager;
import top.hualuo.XhStreamClient;

import javax.annotation.Resource;

/**
 * @author xulongfei
 * @date 2023/8/17 11:19
 */

public class OpenAiApi {


    public static void main(String[] args) {

//        AiManager aiManager = new AiManager();
//        String msg = aiManager.doChat("蔡徐坤");
//        System.out.println(msg);

//        XhStreamClient build = XhStreamClient.builder()
//                .apiHost("spark-api.xf-yun.com")
//                .apiPath("/v1.1/chat")
//                .appId("37fdd02f")
//                .apiKey("YzQxZDU2OWRiNTdmYjVlZTUxN2RlZDdl")
//                .apiSecret("aec12ac746e7ea37526897d8767e237e")
//                .build();


//                /**
//         * AI 对话（需要自己创建请求响应对象）
//         *
//         * @param request
//         * @param openAiApiKey
//         * @return
//         */
//
//            String url = "https://api.openai.com/v1/chat/completions";
//            String json = "{\n" +
//                    "    \"id\": \"chatcmpl-abc123\",\n" +
//                    "    \"object\": \"chat.completion\",\n" +
//                    "    \"created\": 1677858242,\n" +
//                    "    \"model\": \"gpt-3.5-turbo-0613\",\n" +
//                    "    \"usage\": {\n" +
//                    "        \"prompt_tokens\": 13,\n" +
//                    "        \"completion_tokens\": 7,\n" +
//                    "        \"total_tokens\": 20\n" +
//                    "    },\n" +
//                    "    \"choices\": [\n" +
//                    "        {\n" +
//                    "            \"message\": {\n" +
//                    "                \"role\": \"assistant\",\n" +
//                    "                \"content\": \"\\n\\n蔡徐坤\"\n" +
//                    "            },\n" +
//                    "            \"finish_reason\": \"stop\",\n" +
//                    "            \"index\": 0\n" +
//                    "        }\n" +
//                    "    ]\n" +
//                    "}";
//            String result = HttpRequest.post(url)
//                    .header("Authorization", "Bearer " + "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")
//                    .body(json)
//                    .timeout(1000 * 60 * 60 * 24)
//                    .execute()
//                    .body();
//        System.out.println(result);
        }
}
