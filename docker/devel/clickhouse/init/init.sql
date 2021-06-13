CREATE DATABASE IF NOT EXISTS ebalance;

USE ebalance;

CREATE TABLE IF NOT EXISTS  real_time_measure
(
    device_id UInt32,
    measure_date DateTime,
    measure_value Decimal(18, 10)
)
ENGINE = MergeTree()
ORDER BY (device_id, measure_date)
;
