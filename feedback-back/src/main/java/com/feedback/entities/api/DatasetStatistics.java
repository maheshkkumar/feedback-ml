package com.feedback.entities.api;

import com.feedback.entities.DatasetStats;

import java.util.List;


/**
 * Created by Samarth Bhargav on 30/6/15.
 */
public class DatasetStatistics
{
    private List<DatasetStats> datasetStatistics;


    public List<DatasetStats> getDatasetStatistics()
    {
        return datasetStatistics;
    }


    public void setDatasetStatistics( List<DatasetStats> datasetStatistics )
    {
        this.datasetStatistics = datasetStatistics;
    }
}
