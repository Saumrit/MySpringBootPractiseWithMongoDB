package com.saumrit.MySpringBootPractiseWithMongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Student")
public class StudentDTO {

    @Id
    public String _id;

    public String name;
    public String standard;
    public Integer age;
    public Address address;

}
