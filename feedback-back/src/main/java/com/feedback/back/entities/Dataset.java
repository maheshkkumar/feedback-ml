package com.feedback.back.entities;

import org.bson.Document;

import java.util.List;


/**
 * Created by Samarth Bhargav on 8/7/15.
 */
public class Dataset
{
    private String name;
    private List<String> fields;
    private Long updateTime;


    public String getName()
    {
        return name;
    }


    public void setName( String name )
    {
        this.name = name;
    }


    public List<String> getFields()
    {
        return fields;
    }


    public void setFields( List<String> fields )
    {
        this.fields = fields;
    }


    public Long getUpdateTime()
    {
        return updateTime;
    }


    public void setUpdateTime( Long updateTime )
    {
        this.updateTime = updateTime;
    }


    public Document toDocument()
    {
        return new Document( "_id", this.getName() ).append( "fields", this.getFields() )
            .append( "updateTime", this.getUpdateTime() );
    }


    public static Dataset fromDocument( Document document )
    {
        if ( document == null ) {
            return null;
        }
        Dataset dataset = new Dataset();
        dataset.setUpdateTime( document.getLong( "updateTime" ) );
        dataset.setFields( (List<String>) document.get( "fields" ) );
        dataset.setName( document.getString( "_id" ) );
        return dataset;
    }


    @Override
    public String toString()
    {
        return "Dataset{" +
            "name='" + name + '\'' +
            ", fields=" + fields +
            ", updateTime=" + updateTime +
            '}';
    }
}