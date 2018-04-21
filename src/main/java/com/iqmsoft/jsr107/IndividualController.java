package com.iqmsoft.jsr107;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndividualController
{
    @Autowired IndividualService personService;

    @RequestMapping("/person/{ssn}")
    public @ResponseBody String getPerson(@PathVariable("ssn") int ssn)
    {
        return personService.getPerson(ssn).toString();
    }
}
