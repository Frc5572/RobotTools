See [sample.csv] for stage information for compiling [FRC2023].

## `COMPILATION`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | false | false | false |
| finish | false | false | false |

`start` is called as the very first callback, before any other stage.
`finish` is called as the very last callbackc, after every other stage.

There is no individual file associated with the `COMPILATION` task, so all fields are `null`.

## `ANNOTATION_PROCESSING`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | false | false | false |
| finish | false | false | false |

Starts immediately after `COMPILATION`. There is no individual file associated with annotation processing, so all fields are `null`.
Finishes after the final set of `ENTER`s that follow the last `ANNOTATION_PROCESSING_ROUND`.

## `PARSE`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | false | false | false |
| finish | true | false | false |

Called immediately after `ANNOTATION_PROCESSING`. The compilation stage where individual `.java` files are parsed into `CompilationUnitTree`s.

Each file is parsed one after another. 

## `ENTER`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | true | false | false |
| finish | true | false | false |

Called once per file after all files are parsed or an `ANNOTATION_PROCESSING_ROUND` completes.

## `ANNOTATION_PROCESSING_ROUND`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | false | false | false |
| finish | false | false | false |

There is no individual file associated with annotation processing, so all fields are `null`.

## `ANALYZE`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | true | true | true |
| finish | true | true | true |

Called after `ANNOTATION_PROCESSING` finishes. Follows immediately by `GENERATE` for the same file. Called once per file.

## `GENERATE`

|  | CompilationUnit | TypeElement | Trees.getPath(TypeElement) |
| :---: | :--- | :--- | :--- |
| start | true | true | false |
| finish | true | true | false |

Called after `ANALYZE`. Called once per resulting `.class` file.
