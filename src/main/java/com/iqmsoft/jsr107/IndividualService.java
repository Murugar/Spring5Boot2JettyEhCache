package com.iqmsoft.jsr107;

import java.util.Date;
import static java.util.concurrent.TimeUnit.SECONDS;
import javax.cache.CacheManager;
import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheResult;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.Duration;
import javax.cache.expiry.TouchedExpiryPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.stereotype.Component;


@Component
@CacheDefaults(cacheName = "peopleCache")
public class IndividualService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(IndividualService.class);

    @CacheResult
    public Individual getPerson(int ssn)
    {
        LOGGER.info("ssn " + ssn + " not found in cache. TimeStamp: {}", new Date());

        switch (ssn)
        {
            case 123456789:
                return new Individual(ssn, "Geoff", "Gibson");
            case 987654321:
                return new Individual(ssn, "Cory", "Beck");
            default:
                return new Individual(ssn,"John","Doe");
        }
    }


}
