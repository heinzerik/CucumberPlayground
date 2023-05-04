#language:de
Funktionalität: Testfeature zur Demonstration von Cucumber

  Grundlage:
    Gegeben sei die geöffnete Seite http://www.google.com


  Szenario: öffne Google
    Gegeben sei die geöffnete Seite http://www.google.com

  Szenario: Test der immer fehlschlägt
    Wenn ich bin ein Step der immer fehlschlägt

  @ignore
  Szenario: ich bin ein ignorierter Test
    Wenn ich bin ein Step der immer fehlschlägt