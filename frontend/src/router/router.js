import { createRouter, createWebHistory } from 'vue-router'
import AssetsContainer from '../components/AssetsContainer.vue'
import HelloWorld from '../components/HelloWorld.vue'

const routes = [
  { path: '/', component: AssetsContainer},
  { path: '/about', component: AssetsContainer},
  { path: '/contact', component: AssetsContainer},
  { path: '/portfolio', component: HelloWorld}
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router