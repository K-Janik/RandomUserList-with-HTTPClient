package pl.springboot2.karoljanik.httpclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.springboot2.karoljanik.httpclient.model.PersonInfo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    public List<PersonInfo> getAllPersons() {
        RestTemplate restTemplate = new RestTemplate();
        PersonInfo[] personInfo = restTemplate.getForObject("https://random-data-api.com/api/users/random_user?size=4", PersonInfo[].class);
        List<PersonInfo> personInfoList = Arrays.stream(personInfo).collect(Collectors.toList());
        return personInfoList;
        }
    }

