//package com.yupi.springbootinit;
//
//import com.unfbx.chatgpt.OpenAiClient;
//import com.unfbx.chatgpt.entity.completions.Completion;
//import com.unfbx.chatgpt.entity.completions.CompletionResponse;
//import com.unfbx.chatgpt.entity.models.Model;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author xulongfei
// * @date 2023/8/16 17:26
// */
//@SpringBootTest
//public class Test {
//    private OpenAiClient v2;
//
//    @Before
//    public void before() {
//        v2 = new OpenAiClient("sk-**************************30V");
//    }
//
//    @Test
//    public void models() {
//        List<Model> models = v2.models();
//        System.out.println(models.toString());
//    }
//
//    @Test
//    public void model() {
//        Model model = v2.model("code-davinci-002");
//        System.out.println(model.toString());
//    }
//
//    @Test
//    public void completions() {
//        CompletionResponse completions = v2.completions("Java Stream list to map");
//        Arrays.stream(completions.getChoices()).forEach(System.out::println);
//    }
//
//    @Test
//    public void completionsv2() {
//        Completion q = Completion.builder()
//                .prompt("三体人是什么？")
//                .build();
//        CompletionResponse completions = v2.completions(q);
//        System.out.println(completions);
//    }
//}
