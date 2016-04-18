Swagger UI: http://localhost:8080/swagger-ui.html

Swagger UI Model Schema shows all the properties of the model even if some properties are hidden with @JsonView in mixins, 
Springfox will fix it in the next release: https://github.com/springfox/springfox/issues/563

We can change the result JSONs (hide fields or create flat JSONs instead of nested etc.) 
according to our needs using Jackson annotations in mixin classes: http://www.baeldung.com/jackson-annotations
