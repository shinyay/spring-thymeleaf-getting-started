# Getting started with Thymeleaf

Thymeleaf is a Java XML/XHTML/HTML5 template engine.

- [Thymeleaf](https://www.thymeleaf.org/)

## Description
### Dependency
- `org.springframework.boot:spring-boot-starter-thymeleaf`

### Basics
- By default, Spring Boot looks for the templates in `src/main/resources/templates`.
- Template filename is `Return-Value-by-Controller`.html

```java
@GetMapping("/hello")
public String hello(Model model) {
    model.addAttribute("message", "Hello Thymeleaf!!");
    return "hello";
}
```

`src/main/resources/templates/hello.html`
```html
<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8" />
        <title>Hello Thymeleaf</title>
    </head>
    <body>
        <h1 th:text="${message}"></h1>
    </body>
</html>
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References
- [Template Properties](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#application-properties.templating)

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
