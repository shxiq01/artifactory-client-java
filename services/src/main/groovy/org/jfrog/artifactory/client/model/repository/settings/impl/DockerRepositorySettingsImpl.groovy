package org.jfrog.artifactory.client.model.repository.settings.impl

import groovy.transform.EqualsAndHashCode
import org.jfrog.artifactory.client.model.PackageType
import org.jfrog.artifactory.client.model.impl.PackageTypeImpl
import org.jfrog.artifactory.client.model.repository.settings.DockerRepositorySettings
import org.jfrog.artifactory.client.model.repository.settings.docker.DockerApiVersion

/**
 * GroovyBean implementation of the {@link DockerRepositorySettings}
 *
 * @author Ivan Vasylivskyi (ivanvas@jfrog.com)
 */
@EqualsAndHashCode
public class DockerRepositorySettingsImpl implements DockerRepositorySettings{
    DockerApiVersion dockerApiVersion
    Boolean enableTokenAuthentication
    Boolean listRemoteFolderItems
    Integer maxUniqueTags

    @Override
    public PackageType getPackageType() {
        return PackageTypeImpl.docker
    }
}
