#Autor:
  @stories
  Feature: Academy Choucair
    As a user, i want to learn how to automate in screamplay at Choucair Academy with the
    automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than Brandon wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course on the Choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser | strPassword  | StrCourse               |
        | rpenaa  | Febrero.2020 | Metodología Bancolombia |
