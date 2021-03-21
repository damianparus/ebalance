package com.indy.ebalance.device.realtimemeasure

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RealTimeMeasureRepository: MongoRepository<RealTimeMeasure, ObjectId>