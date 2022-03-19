<template>
  <header>
    <NavigationBar />
    <img alt="Vue logo" src="./assets/logo.png">
  </header>
  <main>
    <router-view />
  </main>
  <footer />
  <!-- <AssetsContainer category="Crypto" /> -->
</template>

<script>
  // import AssetsContainer from './components/AssetsContainer.vue'
  import NavigationBar from './components/NavigationBar.vue'

  export default {
    name: 'App',
    components: {
      NavigationBar,
      // AssetsContainer
    }
  }
</script>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
