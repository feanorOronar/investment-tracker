<template>
  <section class="assets">
    <h1>{{ category }} Assets</h1>

    <input v-model="searchTerm" placeholder="Search for assets" />
    <select v-model="selectedAsset">
      <option disabled value="">Please select your asset</option>
      <option v-for="opt in options" :value="opt.value" :key="opt.value">
        {{ opt.text }}
      </option>
    </select>
    <ul id="assetList" v-if="selectedAsset !== ''">
      <li v-for="asset in containsSearchTerm" :key="asset.name" class="asset">
        {{ asset.name }}: {{ asset.price }}
      </li>
    </ul>
  </section>
</template>

<script>
  export default {
    name: 'AssetsContainer',
    data() {
      return {
        options: [
          { text: 'Cryptocurrencies', value: 'crypto' },
          { text: 'MtG Cards', value: 'mtgcards' }
        ],
        assets: {
          'crypto': [
            { name: 'Bitcoin', price: 59000.00 }, 
            { name: 'Ethereum', price: 4200.00 }, 
            { name: 'Binance Coin', price: 578 }, 
            { name: 'Tether', price: 1.00 },
            { name: 'Solana', price: 215.80 },
            { name: 'Cardano', price: 1.80 },
            { name: 'XRP', price: 1.10 },
            { name: 'Polkadot', price: 41.80 },
            { name: 'USD Coin', price: 1.00 },
            { name: 'Dogecoin', price: 0.23 },
            { name: 'Avalanche', price: 105.80 },
            { name: 'Terra', price: 43.03 },
            { name: 'Litecoin', price: 227.73 },
            { name: 'Chainlink', price: 28.97 },
            { name: 'Multivac', price: 0.02 }
          ],
          'mtgcards': [
            { name: 'Black Lotus', price: 10000.10 },
            { name: 'Serra Angel', price: 0.10 },
            { name: 'Underground Sea', price: 700.10 },
            { name: 'Plateau', price: 200.10 },
            { name: 'Swamp', price: 0.03 }
          ]
        },
        searchTerm: '',
        selectedAsset: ''
      }
    },
    props: {
      category: String
    },
    computed: {
      containsSearchTerm() {
        const selectedAssets = this.assets[this.selectedAsset];
        return selectedAssets.filter(asset => 
          asset.name.toLowerCase().includes(this.searchTerm.toLowerCase()))
      },
      isAssetSelected() {
        return this.selectedAsset !== ''
      }
    }
  }
</script>

<style scoped>
  .asset {
    color: rgb(223, 181, 126);
    font-weight: bold;
  }

  ul {
    list-style-type: none;
  }
</style>