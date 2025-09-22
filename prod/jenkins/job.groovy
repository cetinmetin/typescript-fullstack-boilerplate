pipelineJob('TypeScript-Fullstack-Boilerplate') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/cetinmetin/typescript-fullstack-boilerplate.git')
          }
          branch('*/main')
        }
      }
    }
  }
  properties {
    pipelineTriggers {
      triggers {
        githubPush()
        hudsonStartupTrigger {
          nodeParameterName("built-in")
          label("built-in")
          quietPeriod("0")
          runOnChoice("False")
        }
      }
    }
  }
}
