package com.wesco.ordermgmt;

import com.wesco.ordermgmt.CustomerOrderMangmentApp;
import com.wesco.ordermgmt.config.AsyncSyncConfiguration;
import com.wesco.ordermgmt.config.EmbeddedElasticsearch;
import com.wesco.ordermgmt.config.EmbeddedKafka;
import com.wesco.ordermgmt.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CustomerOrderMangmentApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
