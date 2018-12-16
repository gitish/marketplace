@Library('workflowlib-sandbox@v5.5')
import com.lbg.workflow.sandbox.*

properties(defaultBuildJobProperties())

def builder = 'pipelines/build/package.groovy'
def deployer = 'pipelines/deploy/application.groovy'
def unitTests = []
def staticAnalyses = []

// Have a noop integration test in order to trigger package and deploy stages
def integrationTests = ['pipelines/tests/noop.groovy']
BuildHandlers handlers = new ConfigurableBuildHandlers(builder, deployer, unitTests, staticAnalyses, integrationTests)

def appname = "pas-marketplace"
def configuration = "pipelines/conf/job-configuration.json"
def distroList = "Shailendra Kumar Shail<sshail@sapient.com>"
Integer timeout = 60

invokeBuildPipelineHawk(appname, handlers, configuration, distroList, timeout)
