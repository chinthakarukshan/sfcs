package com.springboot.service.impl;

import com.springboot.dto.BaseDTO;
import com.springboot.dto.SupplierPOoDTO;
import com.springboot.model.Order;
import com.springboot.model.Person;
import com.springboot.persistence.OrderRepository;
import com.springboot.persistence.PersonRepository;
import com.springboot.service.SmartSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component(value = "SmartSearchServiceImpl")
public class SmartSearchServiceImpl implements SmartSearchService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Map<String,Object>> getSmartSearchResults() {
        /*SupplierPOoDTO dto = new SupplierPOoDTO();
        dto.setSupplierId("23342432");
        dto.setName("Chinthaka");*/
        Map<String,Object> resultMap = new HashMap<String,Object>();
        List<Map<String,Object>> resultList = new ArrayList<>();
        resultMap.put("PO ID", "REF12883");
        resultMap.put("PO Name","Test PO");
        List<String> lineList = new ArrayList<String>();
        lineList.add("Line 1");
        lineList.add("Line 2");
        lineList.add("Sub Line 3");

        resultMap.put("Line/subline List",lineList);

        Person person = new Person();
        person.setAge(23);
        person.setFirstName("Chinthaka");
        person.setLastName("Weerakkody");

        Order order = new Order();
        order.setOrderNumber(23432);
        order.setPerson(person);

        personRepository.save(person);

        orderRepository.save(order);

        resultList.add(resultMap);
        return resultList;
    }
}
