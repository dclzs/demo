package com.example.demo.myh2.entity.enums;

import java.io.Serializable;

public interface IEnum<T extends Serializable> {
    T getValue();
}

