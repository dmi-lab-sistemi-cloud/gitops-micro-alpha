# gitops-micro-alpha

Per l'esecuzione e il testing in locale

```text
$ mvn clean package
$ docker build -t micro-alpha:1.0.0 .
$ docker run -it --rm -p 8080:8080 micro-alpha:1.0.0
```