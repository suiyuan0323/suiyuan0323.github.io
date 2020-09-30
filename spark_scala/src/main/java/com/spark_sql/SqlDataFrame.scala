package com.spark_sql

import org.apache.spark.sql.SparkSession

object SqlDataFrame {
  def main(args: Array[String]): Unit = {

  }

  def init_spark(appName: String) = {
    SparkSession.builder
      .appName(appName)
      .master("local[4]")
      .getOrCreate()
  }
}
