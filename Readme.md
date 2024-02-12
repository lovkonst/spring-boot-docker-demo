# Приложение для теста Docker

## Тестирование запуска spring-boot приложения с БД Postgres в двух отдельных контейнерах

### Запустить образ Postgres из Docker-hub
docker run --name some-postgres -d -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=username -e POSTGRES_DB=demo_db -v named-volume:/var/lib/postgres/data postgres

### Создать образ spring-boot приложения
docker build -t spring/demo . - с указанным именем

### Команды для создания сети и запуска в ней двух контейнеров отдельно
* docker network ls - просмотр доступных сетей
* docker network create spring-boot-network - Создание сети
* docker network connect spring-boot-network some-postgres - присоединить уже запущенный контейнер "some-postgres" к сети
* docker run -p 8088:8080 --net spring-boot-network spring/demo - развернуть образ "spring/demo" в конкретной сети и сделать проброс портов

