package com.indy.ebalance.realtimemeasure.db

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RealTimeMeasureRepository: MongoRepository<DbRealTimeMeasure, ObjectId>
