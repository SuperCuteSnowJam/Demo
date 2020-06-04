package com.guoqiang.demo.javademo;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

public class SparkDemo {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf();
        conf.set("spark.debug.maxToStringFields", "100");
        SparkSession spark = SparkSession.builder()
                .config(conf)
                .appName("Simple Application For JsonApi")
                .enableHiveSupport()
                .getOrCreate();
        spark.sql("select * from gnpd_dwh.map_master_item_image limit 50").show();
        spark.close();
    }
}
