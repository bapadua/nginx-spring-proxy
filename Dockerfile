FROM nginx:alpine
LABEL authors="brunopadua"
COPY nginx.conf /etc/nginx/nginx.conf

RUN apk update && apk add bash
