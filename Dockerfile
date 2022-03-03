FROM openjdk:16-alpine3.13

COPY target/ target/
COPY fraction.sh fraction.sh

RUN chmod +x fraction.sh

ENTRYPOINT ["sh", "/fraction.sh"]
CMD ["fraction1", "operation", "fraction2"]

