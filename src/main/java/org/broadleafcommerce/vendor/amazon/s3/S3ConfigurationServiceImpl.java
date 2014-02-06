package org.broadleafcommerce.vendor.amazon.s3;

import org.springframework.stereotype.Service;

/**
 * Service that returns the an S3 configuration object.
 * S3 requires two keys to be set.   This service allows you to determine the appropriate keys.
 * 
 * By default, it will rely on the Broadleaf Configuration service to return an appropriate configuration.   
 * The Broadleaf Configuration service is able to be extended in order to pull site-specific or rule based 
 * configurations from the Database or fall back to property file settings if needed.
 * 
 * @author bpolster
 *
 */
@Service("blS3ConfigurationService")
public class S3ConfigurationServiceImpl implements S3ConfigurationService {


    public S3Configuration lookupS3Configuration() {

    }

    /**
     * If the S3Configuration does not set the bucket name, the system will lookup the default name. 
     * @return
     */
    public String lookupS3DefaultBucketName() {

    }

    /**
     * If the S3Configuration does not set the region name, the system will lookup the default name. 
     * @return
     */
    public String lookupS3DefaultRegionName() {

    }
}
