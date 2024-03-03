Inspired by the article on [Redis Cache for API Response Optimization](https://medium.com/@ayushjung63/redis-cache-for-api-response-optimization-54a508d9e79c).

# Improvements
The following improvements are made:

- use stable and latest Spring Boot version;
- java 17 constructions used (record, ...)
- Spring Cache used.
- cache expires
- parameters are configurable.

## Configuration

| Configuration          | Description                                    | Default |
|------------------------|------------------------------------------------|--------:|
| app.cache.timeout.min  | Cache entry time-to-live in minutes            |      10 |
| app.timeout.sec        | how long an expensive methode takes in seconds |      10 |
