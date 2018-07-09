package black.tim.selfbuildproject.netutils;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface BaseNetUtils {

    @FormUrlEncoded
    @POST("getVersion")
    Observable<Object> findPagebyCustomerStock(@FieldMap Map<String, String> map);

}
