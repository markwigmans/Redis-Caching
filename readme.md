
Inspired by the article [Redis Cache for API Response Optimization](https://medium.com/@ayushjung63/redis-cache-for-api-response-optimization-54a508d9e79c), 
I've developed a variant that introduces several optimizations. 
Here's a brief overview of the enhancements made:

## Key Improvements

1. **Updated to Use the Latest Stable Spring Boot Version**: Ensures compatibility with the most recent features and security updates.
2. **Leverage Java 17 Features**: Utilizes modern Java constructions such as records for more efficient and readable code.
3. **Integration of Spring Cache**: Facilitates the use of caching mechanisms to improve performance and separate code from caching functionality.
4. **Configurable Cache Expiration**: Allows for the dynamic setting of cache lifetimes to balance freshness and performance.
5. **Flexible Configuration Options**: Parameters related to cache and method execution times can be easily adjusted.

## Configuration Details

To tailor the application to your specific needs, the following configuration options are available. These settings control aspects such as cache lifetime and method execution timeout, offering a balance between performance and resource usage.

## Configuration

| Configuration Key       | Description                                         | Default Value |
|-------------------------|-----------------------------------------------------|--------------:|
| `app.cache.timeout.min` | Duration before a cache entry expires (in minutes)  |            10 |
| `app.timeout.sec`       | Maximum time an intensive method takes (in seconds) |            10 |

### Notes on Configuration:

- **Cache Timeout (`app.cache.timeout.min`)**: This setting determines how long cached data remains valid. A shorter duration ensures data is refreshed more often, while a longer duration may improve performance by reducing the frequency of data retrieval operations.
- **Method Execution Timeout (`app.timeout.sec`)**: This parameter controls the time a simulated intensive method takes.