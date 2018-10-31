FROM postgres:10-alpine

ENV POSTGRES_DB postgres
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD Rjntyjr1986!

# скопировать все файлы с расширением sql из текущей папки, эти скрипты будут применены к базе при старте
COPY *.sql /docker-entrypoint-initdb.d/
