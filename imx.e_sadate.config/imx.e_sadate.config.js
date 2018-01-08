import * as componentConfig from './imx.e_sadate.constants.js';

const directiveStr = `<${componentConfig.DIRECTIVE_NAME}></${componentConfig.DIRECTIVE_NAME}>`;

function componentRoutes($stateProvider, $urlRouterProvider) {
  let template;

  $stateProvider
    .state('e_sadate', {
      url: '/e_sadate/:caseId/:docRef', //1508100003/A70460O0 -delete, /1508100003 - save
      resolve: {
          process: ($stateParams, screenSvc)=>{
          template = screenSvc.getTemplate($stateParams, directiveStr);
        }
      },
      params: {
        modal: null
      },
      views: {
        'content': {
          template: ()=>{return template.content;}
        },
        'modal': {
          template: ()=>{return template.modal;},
          controller: ($scope, $state)=>{
            $scope.closeModal = ()=>{
              $state.go($state.params.modal.state, {caseId: $state.params.caseId, childState:true}, {reload: false});
            }
          }
        }
      }
    })
    .state('e_sadate_create', {
      url: '/e_sadate/:caseId/create/:abreviation',
        resolve: {
          process: ($stateParams, screenSvc)=>{
          template = screenSvc.getTemplate($stateParams, directiveStr);
        }
      },
      params: {
        modal: null
      },
      views: {
        'content': {
          template: directiveStr
        },
        'modal': {
          template: ()=>{return template.modal;},
          controller: ($scope, $state)=>{
            $scope.closeModal = ()=>{
              $state.go($state.params.modal.state, {caseId: $state.params.caseId, childState:true}, {reload: false});
            }
          }
        }
      }
    });
  $urlRouterProvider.otherwise('/e_dashboard');
}
componentRoutes.$inject = ['$stateProvider', '$urlRouterProvider'];

export {
  componentRoutes,
  componentConfig
};
