# Build
custom_build(
    # Name of the containerr image
    ref = 'edge-service',

    # Command to build the container image
    command = './gradlew bootBuildImage --imageName $EXPECTED_REF',

    # Files to watch that trigger a new build when modified
    deps = ['build.gradle', 'src']
)

# Deploy
k8s_yaml(['k8s/deployment.yaml', 'k8s/service.yaml'])

# Manage
k8s_resource('edge-service', port_forwards=['9000'])