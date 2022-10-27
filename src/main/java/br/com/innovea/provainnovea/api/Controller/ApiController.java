package br.com.innovea.provainnovea.api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ApiController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello word";
    }

    @RequestMapping("/getArticles")
    private String getArticles(){
        String url = "https://newsapi.org/v2/everything?q=tesla&from=2022-09-27&sortBy=publishedAt&apiKey=83429a9887234ad1979aa4bcd7b28de0";
        RestTemplate restTemplate = new RestTemplate();

        String result = restTemplate.getForObject(url, String.class);

        return result;
    }
}
