package com.example.firstproject.firstProject;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.firstproject.firstProject.Datatype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DynamoRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;
    public Datatype save(Datatype type){
        dynamoDBMapper.save(type);
        return type;
    }

    public  Datatype getEmployeeId( String id ){
        return dynamoDBMapper.load(Datatype.class,id);
    }

    public String delete( String id){
        Datatype type= dynamoDBMapper.load(Datatype.class,id);
        dynamoDBMapper.delete(type);
        return " Message Deleted";
    }

}
