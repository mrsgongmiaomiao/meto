package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor//无参构造方法
@AllArgsConstructor//全参构造方法
public class Book {
private int id;
private String img;
private String name;
private String price;

}
