FROM postgres:10-alpine

ENV POSTGRES_DB postgres
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD Rjntyjr1986!

# ����������� ��� ����� � ����������� sql �� ������� �����, ��� ������� ����� ��������� � ���� ��� ������
COPY *.sql /docker-entrypoint-initdb.d/
