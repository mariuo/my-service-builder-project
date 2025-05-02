# my-service-builder-project

## https://learn.liferay.com/w/dxp/liferay-development/building-applications/data-frameworks/service-builder/service-builder-basics/generating-model-persistence-and-service-code


###
d run \
	--name ephesians-mysql \
	--rm \
	-e MYSQL_ALLOW_EMPTY_PASSWORD=yes \
	-e MYSQL_DATABASE=lportal \
	-e MYSQL_PASSWORD=test \
	-e MYSQL_USER=test \
	-it \
	-p 3306:3306 \
	mysql:8 \
	--character-set-server=utf8mb4 \
	--collation-server=utf8mb4_unicode_ci





    docker run \
	--link ephesians-mysql \
	--name ephesians-liferay \
	--rm \
	-e LIFERAY_JDBC_PERIOD_DEFAULT_PERIOD_DRIVER_UPPERCASEC_LASS_UPPERCASEN_AME="com.mysql.cj.jdbc.Driver" \
	-e LIFERAY_JDBC_PERIOD_DEFAULT_PERIOD_PASSWORD="test" \
	-e LIFERAY_JDBC_PERIOD_DEFAULT_PERIOD_URL="jdbc:mysql://ephesians-mysql/lportal?characterEncoding=UTF-8&useFastDateParsing=false&useUnicode=true" \
	-e LIFERAY_JDBC_PERIOD_DEFAULT_PERIOD_USERNAME="test" \
	-it \
	-p 8080:8080 \
	liferay/portal:7.4.3.132-ga132


     ./gradlew h7g5-service:buildService

    ./gradlew classes
     ./gradlew deploy -Ddeploy.docker.container.id=ephesians-liferay