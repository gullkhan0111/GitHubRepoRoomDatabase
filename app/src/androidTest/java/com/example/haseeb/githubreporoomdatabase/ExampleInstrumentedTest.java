package com.example.haseeb.githubreporoomdatabase;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.haseeb.githubreporoomdatabase", appContext.getPackageName());


/*
        //https://api.apixu.com/v1/current.json?key=00a7b0e44e1f4b6dbfb111338180702&q=Paris
        @GET("v1/current.json")
        Call<WeatherList>getCurrent (@Query("key") String key, @Query("q") String q);


        https://api.github.com/search/repositories?q=java

        @Get(search/repositories)


        */

    }
}
