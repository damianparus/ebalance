### API docs

http://localhost:8080/v3/api-docs/

http://localhost:8080/swagger-ui.html

### Add measure

```
curl -X 'POST' \
  'http://localhost:8080/api/measures' \
  -H 'Content-Type: application/json' \
  -d '{
  "dimesionId": 218,
  "measureTime": 1626119204,
  "measureValue": 100.18
}'
```

### Build JAR

`./gradlew bootJar`
