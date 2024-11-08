package hello.hello_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name", required = true) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name1) { // 1. 쿼리 파라미터 `name` 값을 name1에 저장
        Hello hello = new Hello(); // 2. Hello 객체 생성
        hello.setName(name1); // 3. name1 값을 Hello 객체의 name1 필드에 설정
        return hello; // 6. Hello 객체를 JSON 형식으로 반환
    }

    static class Hello {
        private String name3; // 4. JSON 응답에 사용할 필드

        public String getName() {
            return name3; // 5. name1 필드 값을 반환
        }

        public void setName(String name2) {
            this.name3 = name2; // name1 필드에 name2 값 저장
        }
    }
}
