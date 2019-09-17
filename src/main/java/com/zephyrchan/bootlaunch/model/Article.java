package com.zephyrchan.bootlaunch.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@Builder
//@JsonPropertyOrder(value={"content","title"})

public class Article {


    private long id;
    //@JsonProperty("auth")
    private String author;
    @JsonIgnore
    private String title;

    private String content;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private List<Reader> reader;


}
