## Development

### API docs

http://localhost:8080/v3/api-docs/

http://localhost:8080/swagger-ui.html

### Add measure

```shell
curl -X 'POST' \
  'http://localhost:8080/api/measures' \
  -H 'Content-Type: application/json' \
  -d '{
  "dimensionId": 218,
  "measureTime": 1626119204,
  "measureValue": 100.18
}'
```
### JSX preprocessor

```shell
npm install
npx babel --watch ./src/main/js/ --out-dir ./src/main/resources/static/js/ --presets react-app/prod
```
### Build JAR

```shell
./gradlew bootJar
```
