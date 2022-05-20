<div align="center">
    <h1>xuxiaowei-cloud</h1>
    <h3>徐晓伟微服务-next</h3>
    <a href="https://github.com/996icu/996.ICU/blob/master/LICENSE">
        <img alt="License-Anti" src="https://img.shields.io/badge/License-Anti 996-blue.svg">
    </a>
    <a href="https://996.icu/#/zh_CN">
        <img alt="Link-996" src="https://img.shields.io/badge/Link-996.icu-red.svg">
    </a>
    <div>
        <img alt="QQ群" src="https://img.shields.io/badge/QQ群-696503132-blue.svg"/>
    </div>
</div>

<p align="center">
  基于 Spring Boot 3.0.0
</p>

<p align="center">
  为简化开发工作、提高生产率、解决常见问题而生
</p>


<p align="center">

  <a href="https://blog.csdn.net/qq_32596527">
    <img alt="CSDN 码龄" src="https://img.shields.io/badge/dynamic/xml?color=orange&label=CSDN&query=%2F%2Fdiv%5B%40class%3D%27person-code-age%27%5D%5B1%5D%2Fspan%5B1%5D%2Ftext%28%29%5B1%5D&url=https%3A%2F%2Fblog.csdn.net%2Fqq_32596527">
  </a>

  <a href="https://blog.csdn.net/qq_32596527">
    <img alt="CSDN 粉丝" src="https://img.shields.io/badge/dynamic/xml?color=orange&label=CSDN&prefix=%E7%B2%89%E4%B8%9D&query=%2F%2Fli%5B4%5D%2Fa%5B1%5D%2Fdiv%5B%40class%3D%27user-profile-statistics-num%27%5D%5B1%5D%2Ftext%28%29%5B1%5D&url=https%3A%2F%2Fblog.csdn.net%2Fqq_32596527">
  </a>

  <a href="https://blog.csdn.net/qq_32596527">
    <img alt="CSDN 访问" src="https://img.shields.io/badge/dynamic/xml?color=orange&label=CSDN&prefix=%E8%AE%BF%E9%97%AE&query=%2F%2Fli%5B1%5D%2Fdiv%5B%40class%3D%27user-profile-statistics-num%27%5D%5B1%5D%2Ftext%28%29%5B1%5D&url=https%3A%2F%2Fblog.csdn.net%2Fqq_32596527">
  </a>

  <a href="https://blog.csdn.net/qq_32596527">
    <img alt="CSDN 博客" src="https://img.shields.io/badge/dynamic/json?color=orange&label=CSDN&prefix=%E5%8D%9A%E5%AE%A2&query=%24.data.blog&suffix=%E7%AF%87&url=https%3A%2F%2Fblog.csdn.net%2Fcommunity%2Fhome-api%2Fv1%2Fget-tab-total%3Fusername%3Dqq_32596527">
  </a>

  <a href="https://www.jetbrains.com/idea">
    <img alt="IntelliJ IDEA" src="https://img.shields.io/static/v1?logo=data:image/x-icon;base64,AAABAAMAMDAAAAEACACoDgAANgAAACAgAAABAAgAqAgAAN4OAAAQEAAAAQAIAGgFAACGFwAAKAAAADAAAABgAAAAAQAIAAAAAAAACQAAAAAAAAAAAAAAAQAAAAAAAAAAAAC/v78AsLCwAKGhoQA6OjoAKysrAA0NDQD39/cAkJCQABoaGgDZ2dkACwsLALu7uwD19fUAf39/ABgYGADX19cACQkJAPPz8wDk5OQAqKioAJmZmQAjIyMABQUFAP7+/gCIiIgAISEhAODg4ADCwsIAAwMDAPz8/ACVlZUA7e3tAC4uLgB3d3cAAQEBAPr6+gDr6+sAhISEAB0dHQDc3NwADg4OAFdXVwBISEgA+Pj4AOnp6QAMDAwAvLy8AFVVVQD29vYANzc3AICAgAAZGRkA9PT0AI2NjQDW1tYACAgIAKmpqQDy8vIAi4uLANTU1AAVFRUAXl5eALa2tgD///8A8PDwAHp6egAEBAQATU1NAP39/QAvLy8A7u7uAIeHhwDf398AERERAAICAgBaWloAPDw8AC0tLQDs7OwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAQEBAQEBAQEBAQEBAQEBAQEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAQEBAQEBAQEBAQEBAQEBAQEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAQEBAQEBAQEBAQEBAQEBAQEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsaCR0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAtCEEBAQEEUTgAAAAAAAABHR0dHR0dHR0cbHDtGAAAAAAAAAAAAAAAAAAAAAAAAIShAQEBAQEBALDAAAAAAAABAQEBAQEBAQEBAQEAYH0MAAAAAAAAAAAAAAAAAAAAXG0BAQEBAQEBAQDEWAAAAAABAQEBAQEBAQEBAQEBAQCYAAAAAAAAAAAAAAAAAAAAAKyRART9IAhhAQEAfAAAAAABAQEBPGRkZGRkDIEBAQDoRAAAAAAAAAAAAAAAAAAAAAD46RAAAAA5AQEAoAAAAAABAQEA3AAAAAAAANE9AQEAhAAAAAAAAAAAAAAAAAAAAAAA9AAAAAA9AQEAeSwAAAABAQEA3AAAAAAAAAAxAQEAFAAAAAAAAAAAAAAAAAAAAAAAAAAAAACNFQEBALgAAAABAQEA3AAAAAAAAJyBAQDo4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBPGRkZGTY5EkBAQDMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBAQEBAQEBAQEAYFR0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBAQEBAQEBAQEUqAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEA1DAwMAQpAQEAHBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEA3AAAAAABNDUBAPCMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEA3AAAAAAAAL0BAQBYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEA3AAAAAAApE0BAQDIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEAtIiIiIghJQEBART0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBAQEBAQEBAQEBAOQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBAQEBAQEBAQEABSgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeQEBABgAAAABAQEBAQEBAQBglDExLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAoAAAAIAAAAEAAAAABAAgAAAAAAAAEAAAAAAAAAAAAAAABAAAAAAAAAAAAAPv7+wBxcXEApaWlAK6urgDi4uIAt7e3AC0tLQBhYWEAPz8/AP39/QCenp4ASEhIAOTk5AAmJiYA7e3tAI6OjgDCwsIA9vb2AA0NDQDLy8sA////AB8fHwBTU1MAsrKyAFxcXAAGBgYA+Pj4ACEhIQC0tLQAVVVVAF5eXgC9vb0ACAgIAHBwcAB5eXkAV1dXAAEBAQD8/PwAhISEAC4uLgADAwMA9fX1ADc3NwD+/v4AFRUVAB4eHgDl5eUA7u7uAI+PjwAFBQUA3t7eACkpKQBdXV0ABwcHAPn5+QAQEBAAo6OjACIiIgC1tbUAioqKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABUVFRUVFRUVFRUVFQAAAAAAAAAAAAAAAAAAAAAAAAAAFRUVFRUVFRUVFRUVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMi02AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAKDsBFRsYHAAAAAAwMDAwMDAzBhclAAAAAAAAAAAAACgSFRUVFRUFOAAAABUVFRUVFRUVFTwAAAAAAAAAAAAAKQQmMTURFRUiAAAAFRUdHh4kIzAVNxMAAAAAAAAAAAAAIQkAABYVFQMAAAAVFRAAAAAAJxUVFgAAAAAAAAAAAAAAAAAAJSwVGAAAABUVEAAAGjQUFS8pAAAAAAAAAAAAAAAAAAAAChUYAAAAFRUVFRUVFRUqDAAAAAAAAAAAAAAAAAAAAAAKFRgAAAAVFRUVFRUVLB8AAAAAAAAAAAAAAAAAAAAAAAoVGAAAABUVCzo6KwMVNw4AAAAAAAAAAAAAAAAAAAAAChUYAAAAFRUxAAAABxUVAgAAAAAAAAAAAAAAAAAAAAAKFRgAAAAVFTseHhkgFRUIAAAAAAAAAAAAAAAAAAAAAAoVGAAAABUVFRUVFRUVDTgAAAAAAAAAAAAAAAAAAAAAChUYAAAAFRUVFRUVDzkuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgAAAAQAAAAIAAAAAEACAAAAAAAAAEAAAAAAAAAAAAAAAEAAAAAAAAAAAAA+/v7AE9PTwBYWFgA6+vrAAICAgBzc3MAp6enAOTk5ABaWloAbGxsAP///wB1dXUAqampAAYGBgBDQ0MAgICAACoqKgAzMzMACAgIALa2tgC/v78AYGBgAAEBAQDIyMgA/Pz8AJ2dnQAuLi4A/v7+AEBAQADc3NwAsbGxAIiIiABdXV0AxcXFAOnp6QAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsLCwsLCwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4AAAAAAAAAAAAAAAAAAgQBBwUACwscCAYAAAAAABsMIQsdAAsKEhAZEwAAAAAAABccCQALDSAiGBcAAAAAAAAAHAkACxQaIwMAAAAAAAAAABwJAAsWERUfAAAAAAAAAAAcCQALCwseDwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=&message=IntelliJ IDEA">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="GitHub stars" src="https://img.shields.io/github/stars/xuxiaowei-cloud/xuxiaowei-cloud-next?logo=github">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="GitHub forks" src="https://img.shields.io/github/forks/xuxiaowei-cloud/xuxiaowei-cloud-next?logo=github">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="GitHub watchers" src="https://img.shields.io/github/watchers/xuxiaowei-cloud/xuxiaowei-cloud-next?logo=github">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/xuxiaowei-cloud/xuxiaowei-cloud-next">
  </a>

  <a href="https://gitee.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="码云Gitee stars" src="https://gitee.com/xuxiaowei-cloud/xuxiaowei-cloud-next/badge/star.svg?theme=blue">
  </a>

  <a href="https://gitee.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="码云Gitee forks" src="https://gitee.com/xuxiaowei-cloud/xuxiaowei-cloud-next/badge/fork.svg?theme=blue">
  </a>

  <a href="https://gitlab.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="Gitlab stars" src="https://badgen.net/gitlab/stars/xuxiaowei-cloud/xuxiaowei-cloud-next?icon=gitlab">
  </a>

  <a href="https://gitlab.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="Gitlab forks" src="https://badgen.net/gitlab/forks/xuxiaowei-cloud/xuxiaowei-cloud-next?icon=gitlab">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next">
    <img alt="total lines" src="https://tokei.rs/b1/github/xuxiaowei-cloud/xuxiaowei-cloud-next">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next/blob/main/pom.xml">
    <img alt="Spring Boot" src="https://img.shields.io/static/v1?logo=Spring Boot&message=3.0.0-M3">
  </a>

  <a href="https://github.com/xuxiaowei-cloud/xuxiaowei-cloud-next/blob/main/pom.xml">
    <img alt="Spring Cloud" src="https://img.shields.io/static/v1?label=Spring Cloud&message=2022.0.0-M2">
  </a>

  <a href="https://github.com/alibaba/dragonwell17/releases/tag/dragonwell-17.0.3.0.3%2B7_jdk-17.0.3-ga">
    <img alt="JDK" src="https://img.shields.io/badge/JDK-17.0.3-blue.svg"/>
  </a>

  <a href="https://www.apache.org/licenses/LICENSE-2.0">
    <img alt="code style" src="https://img.shields.io/badge/license-Apache 2-blue">
  </a>
</p>

## [脚本](./sh/README.md)

## 鸣谢

1. 感谢 [![jetbrains](./static/jetbrains.ico)](https://www.jetbrains.com/)
   提供开发工具 [![IDEA](./static/idea.png)](https://www.jetbrains.com/idea) 的免费授权

## Stargazers over time

[![Stargazers over time](https://starchart.cc/xuxiaowei-cloud/xuxiaowei-cloud-next.svg)](https://starchart.cc/xuxiaowei-cloud/xuxiaowei-cloud-next)
