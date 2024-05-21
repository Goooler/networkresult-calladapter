package at.connyduck.calladapter.networkresult

import retrofit2.http.GET
import retrofit2.http.HEAD

interface TestApi {
    @GET("testpath")
    suspend fun testEndpointAsync(): NetworkResult<TestResponseClass>

    @GET("testpath")
    fun testEndpointSync(): NetworkResult<TestResponseClass>

    @GET("user")
    suspend fun getUser(): NetworkResult<TestResponseClass>

    @HEAD("user")
    suspend fun headUser(): NetworkResult<Unit>
}
