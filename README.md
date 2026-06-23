# Computação Gráfica

| | |
|---|---|
| **Período** | 7º |
| **Stack** | Java (Swing/AWT), JavaScript |

## Visão geral

Projetos de **computação gráfica 2D**, animação, curvas de Bézier e **processamento digital de imagens** (JDIP). Stack principal: Java (Swing/AWT) e JavaScript.

## Projetos próprios

### `ComputacaoGrafica/computacaoGrafica/`

| Classe | Descrição |
|--------|-----------|
| `MyFrame.java` | Janela principal |
| `GraphicsAnimate.java` | Animação com `Graphics` |
| `Cube.java` | Desenho 3D/projéção |
| Demais em `src/computacaoGrafica/` | Exercícios da disciplina |

```bash
cd ComputacaoGrafica/computacaoGrafica/src
javac computacaoGrafica/*.java
java computacaoGrafica.MyFrame
```

### `Benzier-20221207T222304Z-001/Benzier/`

Curvas de **Bézier** em JavaScript (`script.js`) — demo interativa no navegador.

## Processamento digital de imagens (JDIP)

`JavaExamples-main/JDIP/` — aplicação Java com **filtros de imagem** (blur, sharpen, edge detect, etc.) baseada em [JHLabs IP filters](http://www.jhlabs.com/ip/filters/index.html).

| Classe | Descrição |
|--------|-----------|
| `ImageProcessing.java` | Pipeline de filtros sobre imagens |
| `MainWindow.java` | Interface da aplicação |
| `ViewPanel.java` | Visualização do resultado |

```bash
cd JavaExamples-main/JDIP
mvn spring-boot:run   # ou abrir via IDE / mvn exec
```

## Relacionado

- [puc-inteligencia-artificial](https://github.com/rodviana/puc-inteligencia-artificial) — **PCA / eigenfaces** (PDI aplicado a reconhecimento facial)

## Material de referência

`JavaExamples-main/` — coleção Maven com exemplos (Chat, Notepad, JDIP, etc.). Uso educacional; créditos aos autores originais.
---

## Autor

**Rodrigo Viana Quirino** — Ciência da Computação, PUC Goiás.

Repositório público na conta [rodviana](https://github.com/rodviana).
