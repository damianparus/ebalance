package com.indy.ebalance.measure.db

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface MeasureRepository: MongoRepository<DbMeasure, ObjectId>
