package black.tim.selfbuildproject.netutils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class OKHttpUtils {

    public static OkHttpClient client = new OkHttpClient();
    List s = new ArrayList();
    List ls = new LinkedList();

    public static BaseNetUtils mDesignApi;

    public static String BASE_URL = "";

    public static BaseNetUtils getDesignApi() {

        if (mDesignApi == null) {
            Retrofit retrofit = new Retrofit.Builder().client(client).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

            mDesignApi = retrofit.create(BaseNetUtils.class);
        }
        return mDesignApi;
    }

}
